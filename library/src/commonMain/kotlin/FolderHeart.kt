package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderHeart: ImageVector
    get() {
        if (_FolderHeart != null) {
            return _FolderHeart!!
        }
        _FolderHeart = ImageVector.Builder(
            name = "FolderHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.89f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                moveTo(18.42f, 13.5f)
                lineTo(15f, 17f)
                lineTo(11.59f, 13.5f)
                curveTo(11.22f, 13.12f, 11f, 12.62f, 11f, 12.05f)
                curveTo(11f, 10.92f, 11.9f, 10f, 13f, 10f)
                curveTo(13.54f, 10f, 14.05f, 10.23f, 14.42f, 10.61f)
                lineTo(15f, 11.2f)
                lineTo(15.59f, 10.6f)
                curveTo(15.95f, 10.23f, 16.46f, 10f, 17f, 10f)
                curveTo(18.1f, 10f, 19f, 10.92f, 19f, 12.05f)
                curveTo(19f, 12.61f, 18.78f, 13.13f, 18.42f, 13.5f)
                close()
            }
        }.build()

        return _FolderHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FolderHeart: ImageVector? = null
