package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionMarker: ImageVector
    get() {
        if (_SelectionMarker != null) {
            return _SelectionMarker!!
        }
        _SelectionMarker = ImageVector.Builder(
            name = "SelectionMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(22f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.89f, 22f, 4f)
                moveTo(2f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                moveTo(10f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(2f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                moveTo(18.5f, 13f)
                curveTo(20.4f, 13f, 22f, 14.6f, 22f, 16.5f)
                curveTo(22f, 19.1f, 18.5f, 23f, 18.5f, 23f)
                curveTo(18.5f, 23f, 15f, 19.1f, 15f, 16.5f)
                curveTo(15f, 14.6f, 16.6f, 13f, 18.5f, 13f)
                moveTo(18.5f, 17.8f)
                curveTo(19.2f, 17.8f, 19.8f, 17.2f, 19.7f, 16.6f)
                curveTo(19.7f, 16f, 19.1f, 15.4f, 18.5f, 15.4f)
                curveTo(17.9f, 15.4f, 17.3f, 15.9f, 17.3f, 16.6f)
                curveTo(17.3f, 17.2f, 17.8f, 17.8f, 18.5f, 17.8f)
                moveTo(20f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(12.34f)
                curveTo(21.42f, 11.84f, 20.74f, 11.45f, 20f, 11.23f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _SelectionMarker!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionMarker: ImageVector? = null
