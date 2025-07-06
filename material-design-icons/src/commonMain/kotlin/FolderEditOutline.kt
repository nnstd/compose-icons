package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderEditOutline: ImageVector
    get() {
        if (_FolderEditOutline != null) {
            return _FolderEditOutline!!
        }
        _FolderEditOutline = ImageVector.Builder(
            name = "FolderEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                horizontalLineTo(12.13f)
                lineTo(11f, 19.13f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                verticalLineTo(10.15f)
                curveTo(21.74f, 10.06f, 21.46f, 10f, 21.17f, 10f)
                curveTo(20.75f, 10f, 20.36f, 10.11f, 20f, 10.3f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14f, 23.05f, 13.67f, 22.85f, 13.47f)
                moveTo(13f, 19.96f)
                verticalLineTo(22f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13f, 19.96f)
                close()
            }
        }.build()

        return _FolderEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderEditOutline: ImageVector? = null
