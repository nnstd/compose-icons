package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SolarPanel: ImageVector
    get() {
        if (_SolarPanel != null) {
            return _SolarPanel!!
        }
        _SolarPanel = ImageVector.Builder(
            name = "SolarPanel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(4f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(4f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                moveTo(20f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                moveTo(20f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _SolarPanel!!
    }

@Suppress("ObjectPropertyName")
private var _SolarPanel: ImageVector? = null
