package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Piano: ImageVector
    get() {
        if (_Piano != null) {
            return _Piano!!
        }
        _Piano = ImageVector.Builder(
            name = "Piano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                moveTo(14.74f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(9.31f)
                curveTo(9.86f, 14f, 10.3f, 13.56f, 10.3f, 13f)
                verticalLineTo(4f)
                horizontalLineTo(13.75f)
                verticalLineTo(13f)
                curveTo(13.75f, 13.56f, 14.19f, 14f, 14.74f, 14f)
                moveTo(4f, 4f)
                horizontalLineTo(6.8f)
                verticalLineTo(13f)
                curveTo(6.8f, 13.56f, 7.24f, 14f, 7.79f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(20f, 20f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(16.26f)
                curveTo(16.81f, 14f, 17.25f, 13.56f, 17.25f, 13f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Piano!!
    }

@Suppress("ObjectPropertyName")
private var _Piano: ImageVector? = null
