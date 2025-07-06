package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BaseballDiamond: ImageVector
    get() {
        if (_BaseballDiamond != null) {
            return _BaseballDiamond!!
        }
        _BaseballDiamond = ImageVector.Builder(
            name = "BaseballDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.79f, 12.79f)
                lineTo(2f, 9f)
                curveTo(2f, 9f, 6f, 3f, 12f, 3f)
                reflectiveCurveTo(22f, 9f, 22f, 9f)
                lineTo(18.21f, 12.79f)
                lineTo(12f, 6.59f)
                lineTo(5.79f, 12.79f)
                moveTo(13.5f, 18f)
                horizontalLineTo(10.5f)
                verticalLineTo(20f)
                lineTo(12f, 21f)
                lineTo(13.5f, 20f)
                verticalLineTo(18f)
                moveTo(16.79f, 14.21f)
                lineTo(14.2f, 16.8f)
                curveTo(13.6f, 16.31f, 12.84f, 16f, 12f, 16f)
                reflectiveCurveTo(10.4f, 16.31f, 9.8f, 16.8f)
                lineTo(7.21f, 14.21f)
                lineTo(12f, 9.41f)
                lineTo(16.79f, 14.21f)
                moveTo(13f, 14f)
                curveTo(13f, 13.45f, 12.55f, 13f, 12f, 13f)
                reflectiveCurveTo(11f, 13.45f, 11f, 14f)
                reflectiveCurveTo(11.45f, 15f, 12f, 15f)
                reflectiveCurveTo(13f, 14.55f, 13f, 14f)
                close()
            }
        }.build()

        return _BaseballDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballDiamond: ImageVector? = null
