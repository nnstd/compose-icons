package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderStarMultiple: ImageVector
    get() {
        if (_FolderStarMultiple != null) {
            return _FolderStarMultiple!!
        }
        _FolderStarMultiple = ImageVector.Builder(
            name = "FolderStarMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                curveTo(0f, 21.11f, 0.895f, 22f, 2f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                moveTo(22f, 4f)
                horizontalLineTo(14f)
                lineTo(12f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(16f)
                curveTo(4f, 17.1f, 4.89f, 18f, 6f, 18f)
                horizontalLineTo(22f)
                curveTo(23.11f, 18f, 24f, 17.1f, 24f, 16f)
                verticalLineTo(6f)
                curveTo(24f, 4.89f, 23.11f, 4f, 22f, 4f)
                moveTo(19.94f, 15f)
                lineTo(17f, 13.27f)
                lineTo(14.06f, 15f)
                lineTo(14.84f, 11.66f)
                lineTo(12.25f, 9.42f)
                lineTo(15.66f, 9.13f)
                lineTo(17f, 6f)
                lineTo(18.34f, 9.13f)
                lineTo(21.75f, 9.42f)
                lineTo(19.16f, 11.66f)
                lineTo(19.94f, 15f)
                close()
            }
        }.build()

        return _FolderStarMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStarMultiple: ImageVector? = null
