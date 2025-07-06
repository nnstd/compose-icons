package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bandage: ImageVector
    get() {
        if (_Bandage != null) {
            return _Bandage!!
        }
        _Bandage = ImageVector.Builder(
            name = "Bandage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.73f, 12f)
                lineTo(21.71f, 8.04f)
                curveTo(22.1f, 7.65f, 22.1f, 7f, 21.71f, 6.63f)
                lineTo(17.37f, 2.29f)
                curveTo(17f, 1.9f, 16.35f, 1.9f, 15.96f, 2.29f)
                lineTo(12f, 6.27f)
                lineTo(8f, 2.29f)
                curveTo(7.8f, 2.1f, 7.55f, 2f, 7.29f, 2f)
                curveTo(7.04f, 2f, 6.78f, 2.1f, 6.59f, 2.29f)
                lineTo(2.25f, 6.63f)
                curveTo(1.86f, 7f, 1.86f, 7.65f, 2.25f, 8.04f)
                lineTo(6.23f, 12f)
                lineTo(2.25f, 16f)
                curveTo(1.86f, 16.39f, 1.86f, 17f, 2.25f, 17.41f)
                lineTo(6.59f, 21.75f)
                curveTo(7f, 22.14f, 7.61f, 22.14f, 8f, 21.75f)
                lineTo(12f, 17.77f)
                lineTo(15.96f, 21.75f)
                curveTo(16.16f, 21.95f, 16.41f, 22.04f, 16.67f, 22.04f)
                curveTo(16.93f, 22.04f, 17.18f, 21.94f, 17.38f, 21.75f)
                lineTo(21.72f, 17.41f)
                curveTo(22.11f, 17f, 22.11f, 16.39f, 21.72f, 16f)
                lineTo(17.73f, 12f)
                moveTo(12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(7.29f, 10.96f)
                lineTo(3.66f, 7.34f)
                lineTo(7.29f, 3.71f)
                lineTo(10.91f, 7.33f)
                lineTo(7.29f, 10.96f)
                moveTo(10f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                moveTo(12f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(14f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                moveTo(16.66f, 20.34f)
                lineTo(13.03f, 16.72f)
                lineTo(16.66f, 13.09f)
                lineTo(20.28f, 16.71f)
                lineTo(16.66f, 20.34f)
                close()
            }
        }.build()

        return _Bandage!!
    }

@Suppress("ObjectPropertyName")
private var _Bandage: ImageVector? = null
