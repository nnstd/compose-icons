package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderSync: ImageVector
    get() {
        if (_FolderSync != null) {
            return _FolderSync!!
        }
        _FolderSync = ImageVector.Builder(
            name = "FolderSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(11.5f)
                curveTo(21.23f, 11.18f, 20.39f, 11f, 19.5f, 11f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17.5f)
                curveTo(13f, 18.39f, 13.18f, 19.23f, 13.5f, 20f)
                horizontalLineTo(4f)
                curveTo(2.89f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                moveTo(19f, 12f)
                verticalLineTo(13.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 17.5f)
                curveTo(23f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 12f)
                moveTo(19f, 23f)
                verticalLineTo(21.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.5f)
                curveTo(15f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 23f)
                close()
            }
        }.build()

        return _FolderSync!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSync: ImageVector? = null
