package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Yeast: ImageVector
    get() {
        if (_Yeast != null) {
            return _Yeast!!
        }
        _Yeast = ImageVector.Builder(
            name = "Yeast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                lineTo(14.09f, 17.15f)
                curveTo(14.05f, 16.45f, 13.92f, 15.84f, 13.55f, 15.5f)
                curveTo(13.35f, 15.3f, 13.07f, 15.19f, 12.75f, 15.13f)
                curveTo(11.79f, 15.68f, 10.68f, 16f, 9.5f, 16f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 3f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9.5f)
                curveTo(16f, 10.68f, 15.68f, 11.79f, 15.13f, 12.75f)
                curveTo(15.19f, 13.07f, 15.3f, 13.35f, 15.5f, 13.55f)
                curveTo(15.84f, 13.92f, 16.45f, 14.05f, 17.15f, 14.09f)
                lineTo(18f, 14f)
                moveTo(7.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 10f)
                moveTo(9.5f, 5f)
                curveTo(7f, 5f, 5f, 7f, 5f, 9.5f)
                curveTo(5f, 12f, 7f, 14f, 9.5f, 14f)
                curveTo(12f, 14f, 14f, 12f, 14f, 9.5f)
                curveTo(14f, 7f, 12f, 5f, 9.5f, 5f)
                close()
            }
        }.build()

        return _Yeast!!
    }

@Suppress("ObjectPropertyName")
private var _Yeast: ImageVector? = null
