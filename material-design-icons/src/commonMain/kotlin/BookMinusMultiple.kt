package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookMinusMultiple: ImageVector
    get() {
        if (_BookMinusMultiple != null) {
            return _BookMinusMultiple!!
        }
        _BookMinusMultiple = ImageVector.Builder(
            name = "BookMinusMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                curveTo(3f, 21.11f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.44f, 21.39f, 13.2f, 20.71f, 13.09f, 20f)
                moveTo(19f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                lineTo(12f, 5.5f)
                lineTo(10f, 7f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                curveTo(7.9f, 2f, 7f, 2.9f, 7f, 4f)
                verticalLineTo(16f)
                curveTo(7f, 17.11f, 7.9f, 18f, 9f, 18f)
                horizontalLineTo(13.09f)
                curveTo(13.64f, 14.73f, 16.74f, 12.53f, 20f, 13.08f)
                curveTo(20.34f, 13.14f, 20.68f, 13.23f, 21f, 13.34f)
                verticalLineTo(4f)
                curveTo(21f, 2.9f, 20.11f, 2f, 19f, 2f)
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _BookMinusMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BookMinusMultiple: ImageVector? = null
