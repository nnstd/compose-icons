package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileRefreshOutline: ImageVector
    get() {
        if (_FileRefreshOutline != null) {
            return _FileRefreshOutline!!
        }
        _FileRefreshOutline = ImageVector.Builder(
            name = "FileRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16f, 18f, 16f)
                curveTo(16.62f, 16f, 15.5f, 17.12f, 15.5f, 18.5f)
                curveTo(15.5f, 19.88f, 16.62f, 21f, 18f, 21f)
                curveTo(18.82f, 21f, 19.54f, 20.61f, 20f, 20f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18f, 22.5f)
                curveTo(15.79f, 22.5f, 14f, 20.71f, 14f, 18.5f)
                curveTo(14f, 16.29f, 15.79f, 14.5f, 18f, 14.5f)
                moveTo(14f, 2f)
                lineTo(20f, 8f)
                verticalLineTo(12.17f)
                curveTo(19.5f, 12.06f, 19f, 12f, 18.5f, 12f)
                lineTo(18f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(12.17f)
                curveTo(12.34f, 20.72f, 12.63f, 21.39f, 13f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _FileRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileRefreshOutline: ImageVector? = null
