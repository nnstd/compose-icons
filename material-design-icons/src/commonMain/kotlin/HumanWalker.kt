package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanWalker: ImageVector
    get() {
        if (_HumanWalker != null) {
            return _HumanWalker!!
        }
        _HumanWalker = ImageVector.Builder(
            name = "HumanWalker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(13.1f, 2f, 14f, 2.9f, 14f, 4f)
                reflectiveCurveTo(13.1f, 6f, 12f, 6f)
                reflectiveCurveTo(10f, 5.1f, 10f, 4f)
                reflectiveCurveTo(10.9f, 2f, 12f, 2f)
                moveTo(19.8f, 17.7f)
                lineTo(19.2f, 11.3f)
                curveTo(19.1f, 10.5f, 18.5f, 10f, 17.7f, 10f)
                horizontalLineTo(16f)
                curveTo(14.5f, 10f, 13.1f, 9.5f, 12.2f, 8.6f)
                lineTo(10.2f, 6.6f)
                curveTo(10.1f, 6.4f, 9.6f, 6f, 8.8f, 6f)
                curveTo(8.3f, 6f, 7.8f, 6.2f, 7.4f, 6.6f)
                lineTo(4.1f, 9.9f)
                curveTo(3.6f, 10.6f, 3.6f, 11.5f, 3.9f, 12f)
                lineTo(5.3f, 14.8f)
                lineTo(2.2f, 18.8f)
                lineTo(3.8f, 20f)
                lineTo(7.5f, 15.3f)
                lineTo(7.2f, 14f)
                lineTo(8f, 14.8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(13.9f)
                lineTo(7.9f, 11.8f)
                lineTo(10.3f, 9.4f)
                curveTo(11.2f, 10.3f, 12f, 11.2f, 13.9f, 11.7f)
                lineTo(13f, 20f)
                horizontalLineTo(14.5f)
                lineTo(14.9f, 16.5f)
                horizontalLineTo(18.1f)
                lineTo(18.2f, 17.7f)
                curveTo(17.8f, 18f, 17.5f, 18.4f, 17.5f, 19f)
                curveTo(17.5f, 19.8f, 18.2f, 20.5f, 19f, 20.5f)
                reflectiveCurveTo(20.5f, 19.8f, 20.5f, 19f)
                curveTo(20.5f, 18.5f, 20.2f, 18f, 19.8f, 17.7f)
                moveTo(15.1f, 15f)
                lineTo(15.5f, 11.5f)
                horizontalLineTo(17.5f)
                lineTo(17.9f, 15f)
                horizontalLineTo(15.1f)
                close()
            }
        }.build()

        return _HumanWalker!!
    }

@Suppress("ObjectPropertyName")
private var _HumanWalker: ImageVector? = null
