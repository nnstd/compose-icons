package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nature: ImageVector
    get() {
        if (_Nature != null) {
            return _Nature!!
        }
        _Nature = ImageVector.Builder(
            name = "Nature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 16.12f)
                curveTo(16.47f, 15.71f, 19.17f, 12.76f, 19.17f, 9.17f)
                curveTo(19.17f, 5.3f, 16.04f, 2.17f, 12.17f, 2.17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.17f, 9.17f)
                curveTo(5.17f, 12.64f, 7.69f, 15.5f, 11f, 16.06f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(16.12f)
                close()
            }
        }.build()

        return _Nature!!
    }

@Suppress("ObjectPropertyName")
private var _Nature: ImageVector? = null
