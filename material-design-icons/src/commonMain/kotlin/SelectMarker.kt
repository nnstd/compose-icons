package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectMarker: ImageVector
    get() {
        if (_SelectMarker != null) {
            return _SelectMarker!!
        }
        _SelectMarker = ImageVector.Builder(
            name = "SelectMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                curveTo(3f, 3.45f, 3.45f, 3f, 4f, 3f)
                moveTo(20f, 3f)
                curveTo(20.55f, 3f, 21f, 3.45f, 21f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                moveTo(15f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(11f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(7f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                moveTo(11f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                moveTo(7f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                moveTo(4f, 21f)
                curveTo(3.45f, 21f, 3f, 20.55f, 3f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                moveTo(3f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(3f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(21f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(19.5f, 13f)
                curveTo(21.4f, 13f, 23f, 14.6f, 23f, 16.5f)
                curveTo(23f, 19.1f, 19.5f, 23f, 19.5f, 23f)
                curveTo(19.5f, 23f, 16f, 19.1f, 16f, 16.5f)
                curveTo(16f, 14.6f, 17.6f, 13f, 19.5f, 13f)
                moveTo(19.5f, 17.8f)
                curveTo(20.2f, 17.8f, 20.8f, 17.2f, 20.7f, 16.6f)
                curveTo(20.7f, 16f, 20.1f, 15.4f, 19.5f, 15.4f)
                curveTo(18.9f, 15.4f, 18.3f, 15.9f, 18.3f, 16.6f)
                curveTo(18.3f, 17.2f, 18.8f, 17.8f, 19.5f, 17.8f)
                close()
            }
        }.build()

        return _SelectMarker!!
    }

@Suppress("ObjectPropertyName")
private var _SelectMarker: ImageVector? = null
