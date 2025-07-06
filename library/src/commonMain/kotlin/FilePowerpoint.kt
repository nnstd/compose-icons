package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePowerpoint: ImageVector
    get() {
        if (_FilePowerpoint != null) {
            return _FilePowerpoint!!
        }
        _FilePowerpoint = ImageVector.Builder(
            name = "FilePowerpoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.6f, 12.3f)
                horizontalLineTo(10.6f)
                verticalLineTo(15.5f)
                horizontalLineTo(12.7f)
                curveTo(13.3f, 15.5f, 13.6f, 15.3f, 13.9f, 15f)
                curveTo(14.2f, 14.7f, 14.3f, 14.4f, 14.3f, 13.9f)
                curveTo(14.3f, 13.4f, 14.2f, 13.1f, 13.9f, 12.8f)
                curveTo(13.6f, 12.5f, 13.2f, 12.3f, 12.6f, 12.3f)
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(15.2f, 16f)
                curveTo(14.6f, 16.5f, 14.1f, 16.7f, 12.8f, 16.7f)
                horizontalLineTo(10.6f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(12.8f)
                curveTo(14.1f, 11f, 14.7f, 11.3f, 15.2f, 11.8f)
                curveTo(15.8f, 12.4f, 16f, 13f, 16f, 13.9f)
                curveTo(16f, 14.8f, 15.8f, 15.5f, 15.2f, 16f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FilePowerpoint!!
    }

@Suppress("ObjectPropertyName")
private var _FilePowerpoint: ImageVector? = null
