package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Food: ImageVector
    get() {
        if (_Food != null) {
            return _Food!!
        }
        _Food = ImageVector.Builder(
            name = "Food",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.06f, 23f)
                horizontalLineTo(19.72f)
                curveTo(20.56f, 23f, 21.25f, 22.35f, 21.35f, 21.53f)
                lineTo(23f, 5.05f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16.03f)
                verticalLineTo(5.05f)
                horizontalLineTo(11.06f)
                lineTo(11.36f, 7.39f)
                curveTo(13.07f, 7.86f, 14.67f, 8.71f, 15.63f, 9.65f)
                curveTo(17.07f, 11.07f, 18.06f, 12.54f, 18.06f, 14.94f)
                verticalLineTo(23f)
                moveTo(1f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(16.03f)
                verticalLineTo(22f)
                curveTo(16.03f, 22.54f, 15.58f, 23f, 15f, 23f)
                horizontalLineTo(2f)
                curveTo(1.45f, 23f, 1f, 22.54f, 1f, 22f)
                moveTo(16.03f, 15f)
                curveTo(16.03f, 7f, 1f, 7f, 1f, 15f)
                horizontalLineTo(16.03f)
                moveTo(1f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Food!!
    }

@Suppress("ObjectPropertyName")
private var _Food: ImageVector? = null
