package com.cfyifei.achievement;

import java.util.ArrayList;
import java.util.List;

import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class AchievementFcList {
/*
	public static Achievement GetDouzi = new Achievement("AchievementFc.douzi", "Douzi", 0, -2, ModItem.ItemDouzi, AchievementList.openInventory).registerStat();
	public static Achievement GetDami = new Achievement("AchievementFc.dami", "Dami", -2, -2, ModItem.ItemDami, GetDouzi).registerStat();
	public static Achievement GetHuashen = new Achievement("AchievementFc.huashen", "Huashen", -4, -2, ModItem.ItemHuashen, GetDami).registerStat();
	public static Achievement GetNmj = new Achievement("AchievementFc.nmj", "Nmj", -6, -2, ModGui.Nmj, GetHuashen).registerStat();
	public static Achievement GetDoujiang = new Achievement("AchievementFc.doujiang", "Doujiang", -6, 0, ModItem.ItemDoujiang, GetNmj).registerStat();
	public static Achievement Getfan = new Achievement("AchievementFc.fan", "Fan", -4, 0, ModItem.Itemfan, GetDoujiang).registerStat();
	public static Achievement GetHuashenyou = new Achievement("AchievementFc.huashenyou", "Huashenyou", -2, 0, ModItem.ItemHuashenyou, Getfan).registerStat();
	public static Achievement GetMianfen = new Achievement("AchievementFc.mianfen", "Mianfen", -2, 2, ModItem.ItemMianfen, GetHuashenyou).registerStat();
	public static Achievement GetPDG = new Achievement("AchievementFc.pdg", "PDG", -4, 2, ModGui.PDG, GetMianfen).registerStat();
	public static Achievement GetGuo = new Achievement("AchievementFc.guo", "Guo", -6, 2, ModGui.Guo, GetPDG).registerStat();
	public static Achievement GetGyg = new Achievement("AchievementFc.gyg", "Gyg", -6, 4, ModGui.Gyg, GetGuo).registerStat();
	public static Achievement GetYZJ = new Achievement("AchievementFc.yzj", "YZJ", -4, 4, ModGui.YZJ, GetGyg).registerStat();
	public static Achievement GetCaiban = new Achievement("AchievementFc.caiban", "Caiban", -2, 4, ModGui.Caiban, GetYZJ).registerStat();
	public static Achievement GetTpj = new Achievement("AchievementFc.tpj", "Tpj", -2, 6, ModGui.Tpj, GetCaiban).registerStat();
	public static Achievement GetNt = new Achievement("AchievementFc.nt", "Nt", -4, 6, ModGui.Tpj, GetCaiban).registerStat();
	public static Achievement GetZl = new Achievement("AchievementFc.zl", "Zl", -6, 6, ModGui.Zl, GetNt).registerStat();
	*/
	public static Achievement GetDouzi = new Achievement("AchievementFc.douzi", "Douzi", 0, 0, ModItem.ItemDouzi, AchievementList.openInventory).registerStat();
	public static Achievement GetDami = new Achievement("AchievementFc.dami", "Dami", 0, 0, ModItem.ItemDami, GetDouzi).registerStat();
	public static Achievement GetHuashen = new Achievement("AchievementFc.huashen", "Huashen", 0, 0, ModItem.ItemHuashen, GetDami).registerStat();
	public static Achievement GetNmj = new Achievement("AchievementFc.nmj", "Nmj", 0, 0, ModGui.Nmj, GetHuashen).registerStat();
	public static Achievement GetDoujiang = new Achievement("AchievementFc.doujiang", "Doujiang", 0, 0, ModItem.ItemDoujiang, GetNmj).registerStat();
	public static Achievement Getfan = new Achievement("AchievementFc.fan", "Fan", 0, 0,  ModItem.Itemfan, GetDoujiang).registerStat();
	public static Achievement GetHuashenyou = new Achievement("AchievementFc.huashenyou", "Huashenyou", 0, 0, ModItem.ItemHuashenyou, Getfan).registerStat();
	public static Achievement GetMianfen = new Achievement("AchievementFc.mianfen", "Mianfen", 0, 0, ModItem.ItemMianfen, GetHuashenyou).registerStat();
	public static Achievement GetPDG = new Achievement("AchievementFc.pdg", "PDG", 0, 0,  ModGui.PDG, GetMianfen).registerStat();
	public static Achievement GetGuo = new Achievement("AchievementFc.guo", "Guo", 0, 0, ModGui.Guo, GetPDG).registerStat();
	public static Achievement GetGyg = new Achievement("AchievementFc.gyg", "Gyg", 0, 0,  ModGui.Gyg, GetGuo).registerStat();
	public static Achievement GetYZJ = new Achievement("AchievementFc.yzj", "YZJ",  0, 0,  ModGui.YZJ, GetGyg).registerStat();
	public static Achievement GetCaiban = new Achievement("AchievementFc.caiban", "Caiban", 0, 0,  ModGui.Caiban, GetYZJ).registerStat();
	public static Achievement GetTpj = new Achievement("AchievementFc.tpj", "Tpj", 0, 0,  ModGui.Tpj, GetCaiban).registerStat();
	public static Achievement GetNt = new Achievement("AchievementFc.nt", "Nt", 0, 0,  ModGui.Tpj, GetCaiban).registerStat();
	public static Achievement GetZl = new Achievement("AchievementFc.zl", "Zl", 0, 0,  ModGui.Zl, GetNt).registerStat();
}
