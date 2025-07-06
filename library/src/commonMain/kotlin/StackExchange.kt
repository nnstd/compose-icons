package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StackExchange: ImageVector
    get() {
        if (_StackExchange != null) {
            return _StackExchange!!
        }
        _StackExchange = ImageVector.Builder(
            name = "StackExchange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.9f, 10.72f)
                horizontalLineTo(20f)
                verticalLineTo(14.03f)
                horizontalLineTo(3.9f)
                verticalLineTo(10.72f)
                moveTo(3.9f, 6.44f)
                horizontalLineTo(20f)
                verticalLineTo(9.75f)
                horizontalLineTo(3.9f)
                verticalLineTo(6.44f)
                moveTo(17.5f, 2f)
                horizontalLineTo(6.5f)
                curveTo(5.06f, 2f, 3.9f, 3.18f, 3.9f, 4.65f)
                verticalLineTo(5.5f)
                horizontalLineTo(20f)
                verticalLineTo(4.65f)
                curveTo(20f, 3.18f, 18.88f, 2f, 17.5f, 2f)
                moveTo(3.9f, 15f)
                verticalLineTo(15.84f)
                curveTo(3.9f, 17.31f, 5.06f, 18.5f, 6.5f, 18.5f)
                horizontalLineTo(13.37f)
                verticalLineTo(22f)
                lineTo(16.77f, 18.5f)
                horizontalLineTo(17.5f)
                curveTo(18.94f, 18.5f, 20.11f, 17.31f, 20.11f, 15.84f)
                verticalLineTo(15f)
                horizontalLineTo(3.9f)
                close()
            }
        }.build()

        return _StackExchange!!
    }

@Suppress("ObjectPropertyName")
private var _StackExchange: ImageVector? = null
