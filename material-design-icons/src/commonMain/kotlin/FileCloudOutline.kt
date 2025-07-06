package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCloudOutline: ImageVector
    get() {
        if (_FileCloudOutline != null) {
            return _FileCloudOutline!!
        }
        _FileCloudOutline = ImageVector.Builder(
            name = "FileCloudOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(17f, 16.92f)
                curveTo(17f, 18.07f, 16.07f, 19f, 14.92f, 19f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 19f, 7f, 17.88f, 7f, 16.5f)
                curveTo(7f, 15.21f, 8f, 14.15f, 9.23f, 14f)
                curveTo(9.75f, 13f, 10.79f, 12.33f, 12f, 12.33f)
                curveTo(13.5f, 12.33f, 14.78f, 13.42f, 15.07f, 14.83f)
                curveTo(16.14f, 14.93f, 17f, 15.82f, 17f, 16.92f)
                close()
            }
        }.build()

        return _FileCloudOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileCloudOutline: ImageVector? = null
