package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderSearchOutline: ImageVector
    get() {
        if (_FolderSearchOutline != null) {
            return _FolderSearchOutline!!
        }
        _FolderSearchOutline = ImageVector.Builder(
            name = "FolderSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 12f)
                curveTo(19f, 12f, 21f, 14f, 21f, 16.5f)
                curveTo(21f, 17.38f, 20.75f, 18.21f, 20.31f, 18.9f)
                lineTo(23.39f, 22f)
                lineTo(22f, 23.39f)
                lineTo(18.88f, 20.32f)
                curveTo(18.19f, 20.75f, 17.37f, 21f, 16.5f, 21f)
                curveTo(14f, 21f, 12f, 19f, 12f, 16.5f)
                curveTo(12f, 14f, 14f, 12f, 16.5f, 12f)
                moveTo(16.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 14f)
                moveTo(19f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(10.17f)
                curveTo(10.34f, 18.72f, 10.63f, 19.39f, 11f, 20f)
                horizontalLineTo(3f)
                curveTo(1.89f, 20f, 1f, 19.1f, 1f, 18f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                horizontalLineTo(9f)
                lineTo(11f, 6f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8f)
                verticalLineTo(11.81f)
                curveTo(20.42f, 11.26f, 19.75f, 10.81f, 19f, 10.5f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FolderSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSearchOutline: ImageVector? = null
