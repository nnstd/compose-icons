package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SolarPanelLarge: ImageVector
    get() {
        if (_SolarPanelLarge != null) {
            return _SolarPanelLarge!!
        }
        _SolarPanelLarge = ImageVector.Builder(
            name = "SolarPanelLarge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(8f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                moveTo(13f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                moveTo(18f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                moveTo(21f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                moveTo(21f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                moveTo(16f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                moveTo(11f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                moveTo(6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                moveTo(3f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(13f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                moveTo(8f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(3f, 1f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 3f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 16f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1f)
                close()
            }
        }.build()

        return _SolarPanelLarge!!
    }

@Suppress("ObjectPropertyName")
private var _SolarPanelLarge: ImageVector? = null
