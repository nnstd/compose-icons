package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderArrowDownOutline: ImageVector
    get() {
        if (_FolderArrowDownOutline != null) {
            return _FolderArrowDownOutline!!
        }
        _FolderArrowDownOutline = ImageVector.Builder(
            name = "FolderArrowDownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                verticalLineTo(13.81f)
                curveTo(21.39f, 13.46f, 20.72f, 13.22f, 20f, 13.09f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13f, 18.66f, 13f, 19f)
                curveTo(13f, 19.34f, 13.04f, 19.67f, 13.09f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                moveTo(20f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                lineTo(19f, 23f)
                lineTo(22f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FolderArrowDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderArrowDownOutline: ImageVector? = null
