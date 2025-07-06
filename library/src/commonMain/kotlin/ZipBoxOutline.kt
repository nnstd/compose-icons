package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZipBoxOutline: ImageVector
    get() {
        if (_ZipBoxOutline != null) {
            return _ZipBoxOutline!!
        }
        _ZipBoxOutline = ImageVector.Builder(
            name = "ZipBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                moveTo(14f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                moveTo(14f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                moveTo(10f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                moveTo(10f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                moveTo(19f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ZipBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ZipBoxOutline: ImageVector? = null
