package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraPlusOutline: ImageVector
    get() {
        if (_CameraPlusOutline != null) {
            return _CameraPlusOutline!!
        }
        _CameraPlusOutline = ImageVector.Builder(
            name = "CameraPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineTo(17.8f)
                lineTo(16f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(15.1f)
                lineTo(17f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                curveTo(3f, 21.1f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(8f)
                curveTo(23f, 6.9f, 22.1f, 6f, 21f, 6f)
                moveTo(8f, 14f)
                curveTo(8f, 18.45f, 13.39f, 20.69f, 16.54f, 17.54f)
                curveTo(19.69f, 14.39f, 17.45f, 9f, 13f, 9f)
                curveTo(10.24f, 9f, 8f, 11.24f, 8f, 14f)
                moveTo(13f, 11f)
                curveTo(14.64f, 11.05f, 15.95f, 12.36f, 16f, 14f)
                curveTo(15.95f, 15.64f, 14.64f, 16.95f, 13f, 17f)
                curveTo(11.36f, 16.95f, 10.05f, 15.64f, 10f, 14f)
                curveTo(10.05f, 12.36f, 11.36f, 11.05f, 13f, 11f)
                moveTo(5f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
            }
        }.build()

        return _CameraPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraPlusOutline: ImageVector? = null
