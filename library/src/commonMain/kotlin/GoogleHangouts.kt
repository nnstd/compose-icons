package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleHangouts: ImageVector
    get() {
        if (_GoogleHangouts != null) {
            return _GoogleHangouts!!
        }
        _GoogleHangouts = ImageVector.Builder(
            name = "GoogleHangouts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11f)
                lineTo(14f, 13f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                moveTo(11f, 11f)
                lineTo(10f, 13f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                moveTo(11.5f, 2f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.5f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(22.5f)
                curveTo(16.86f, 20.15f, 20f, 15f, 20f, 10.5f)
                curveTo(20f, 5.8f, 16.19f, 2f, 11.5f, 2f)
                close()
            }
        }.build()

        return _GoogleHangouts!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleHangouts: ImageVector? = null
