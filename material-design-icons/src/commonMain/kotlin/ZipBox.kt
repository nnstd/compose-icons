package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZipBox: ImageVector
    get() {
        if (_ZipBox != null) {
            return _ZipBox!!
        }
        _ZipBox = ImageVector.Builder(
            name = "ZipBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                moveTo(14f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _ZipBox!!
    }

@Suppress("ObjectPropertyName")
private var _ZipBox: ImageVector? = null
