package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderArrowDown: ImageVector
    get() {
        if (_FolderArrowDown != null) {
            return _FolderArrowDown!!
        }
        _FolderArrowDown = ImageVector.Builder(
            name = "FolderArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                verticalLineTo(13.81f)
                curveTo(21.12f, 13.3f, 20.1f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
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

        return _FolderArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _FolderArrowDown: ImageVector? = null
