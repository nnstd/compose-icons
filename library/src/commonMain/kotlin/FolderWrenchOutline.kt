package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderWrenchOutline: ImageVector
    get() {
        if (_FolderWrenchOutline != null) {
            return _FolderWrenchOutline!!
        }
        _FolderWrenchOutline = ImageVector.Builder(
            name = "FolderWrenchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.03f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                verticalLineTo(17.5f)
                lineTo(20.96f, 16.44f)
                curveTo(20.97f, 16.3f, 21f, 16.15f, 21f, 16f)
                curveTo(21f, 14.88f, 20.62f, 13.86f, 20f, 13.03f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(11.42f)
                curveTo(11.77f, 18.8f, 12.33f, 19.5f, 13.03f, 20f)
                moveTo(22.87f, 21.19f)
                lineTo(18.76f, 17.08f)
                curveTo(19.17f, 16.04f, 18.94f, 14.82f, 18.08f, 13.97f)
                curveTo(17.18f, 13.06f, 15.83f, 12.88f, 14.74f, 13.38f)
                lineTo(16.68f, 15.32f)
                lineTo(15.33f, 16.68f)
                lineTo(13.34f, 14.73f)
                curveTo(12.8f, 15.82f, 13.05f, 17.17f, 13.93f, 18.08f)
                curveTo(14.79f, 18.94f, 16f, 19.16f, 17.05f, 18.76f)
                lineTo(21.16f, 22.86f)
                curveTo(21.34f, 23.05f, 21.61f, 23.05f, 21.79f, 22.86f)
                lineTo(22.83f, 21.83f)
                curveTo(23.05f, 21.65f, 23.05f, 21.33f, 22.87f, 21.19f)
                close()
            }
        }.build()

        return _FolderWrenchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderWrenchOutline: ImageVector? = null
