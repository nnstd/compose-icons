package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BaseballDiamondOutline: ImageVector
    get() {
        if (_BaseballDiamondOutline != null) {
            return _BaseballDiamondOutline!!
        }
        _BaseballDiamondOutline = ImageVector.Builder(
            name = "BaseballDiamondOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(5f, 2f, 1f, 9f, 1f, 9f)
                lineTo(9.3f, 17.3f)
                curveTo(9.74f, 16.77f, 10.32f, 16.37f, 11f, 16.17f)
                lineTo(7.83f, 13f)
                lineTo(12f, 8.83f)
                lineTo(16.17f, 13f)
                lineTo(13f, 16.17f)
                curveTo(13.68f, 16.37f, 14.27f, 16.77f, 14.7f, 17.3f)
                lineTo(23f, 9f)
                curveTo(23f, 9f, 19f, 2f, 12f, 2f)
                moveTo(17.59f, 11.59f)
                lineTo(12f, 6f)
                lineTo(6.41f, 11.59f)
                lineTo(3.59f, 8.76f)
                curveTo(4.95f, 7f, 7.89f, 4f, 12f, 4f)
                curveTo(16.08f, 4f, 19.03f, 7f, 20.4f, 8.77f)
                lineTo(17.59f, 11.59f)
                moveTo(13f, 13f)
                curveTo(13f, 13.55f, 12.55f, 14f, 12f, 14f)
                reflectiveCurveTo(11f, 13.55f, 11f, 13f)
                reflectiveCurveTo(11.45f, 12f, 12f, 12f)
                reflectiveCurveTo(13f, 12.45f, 13f, 13f)
                moveTo(13.5f, 20f)
                lineTo(12f, 21f)
                lineTo(10.5f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _BaseballDiamondOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballDiamondOutline: ImageVector? = null
