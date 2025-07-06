package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderGoogleDrive: ImageVector
    get() {
        if (_FolderGoogleDrive != null) {
            return _FolderGoogleDrive!!
        }
        _FolderGoogleDrive = ImageVector.Builder(
            name = "FolderGoogleDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.75f, 9f)
                horizontalLineTo(16.14f)
                lineTo(19f, 14f)
                horizontalLineTo(16.05f)
                lineTo(13.5f, 9.46f)
                moveTo(18.3f, 17f)
                horizontalLineTo(12.75f)
                lineTo(14.15f, 14.5f)
                horizontalLineTo(19.27f)
                lineTo(19.53f, 14.96f)
                moveTo(11.5f, 17f)
                lineTo(10.4f, 14.86f)
                lineTo(13.24f, 9.9f)
                lineTo(14.74f, 12.56f)
                lineTo(12.25f, 17f)
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.89f, 21.1f, 6f, 20f, 6f)
                close()
            }
        }.build()

        return _FolderGoogleDrive!!
    }

@Suppress("ObjectPropertyName")
private var _FolderGoogleDrive: ImageVector? = null
