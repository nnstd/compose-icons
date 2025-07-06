package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderStarOutline: ImageVector
    get() {
        if (_FolderStarOutline != null) {
            return _FolderStarOutline!!
        }
        _FolderStarOutline = ImageVector.Builder(
            name = "FolderStarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.78f, 12.05f)
                lineTo(13.81f, 11.79f)
                lineTo(15f, 9f)
                lineTo(16.19f, 11.79f)
                lineTo(19.22f, 12.05f)
                lineTo(16.92f, 14.04f)
                lineTo(17.61f, 17f)
                lineTo(15f, 15.47f)
                lineTo(12.39f, 17f)
                lineTo(13.08f, 14.04f)
                lineTo(10.78f, 12.05f)
                moveTo(22f, 8f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.11f, 6f, 22f, 6.9f, 22f, 8f)
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FolderStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStarOutline: ImageVector? = null
