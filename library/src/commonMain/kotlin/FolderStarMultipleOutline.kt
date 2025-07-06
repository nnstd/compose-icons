package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderStarMultipleOutline: ImageVector
    get() {
        if (_FolderStarMultipleOutline != null) {
            return _FolderStarMultipleOutline!!
        }
        _FolderStarMultipleOutline = ImageVector.Builder(
            name = "FolderStarMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                curveTo(0.895f, 22f, 0f, 21.11f, 0f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                moveTo(12.78f, 10.05f)
                lineTo(15.81f, 9.79f)
                lineTo(17f, 7f)
                lineTo(18.19f, 9.79f)
                lineTo(21.22f, 10.05f)
                lineTo(18.92f, 12.04f)
                lineTo(19.61f, 15f)
                lineTo(17f, 13.47f)
                lineTo(14.39f, 15f)
                lineTo(15.08f, 12.04f)
                lineTo(12.78f, 10.05f)
                moveTo(24f, 6f)
                verticalLineTo(16f)
                curveTo(24f, 17.11f, 23.11f, 18f, 22f, 18f)
                horizontalLineTo(6f)
                curveTo(4.9f, 18f, 4f, 17.11f, 4f, 16f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                lineTo(14f, 4f)
                horizontalLineTo(22f)
                curveTo(23.11f, 4f, 24f, 4.9f, 24f, 6f)
                moveTo(22f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _FolderStarMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStarMultipleOutline: ImageVector? = null
