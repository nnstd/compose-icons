package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FocusFieldHorizontal: ImageVector
    get() {
        if (_FocusFieldHorizontal != null) {
            return _FocusFieldHorizontal!!
        }
        _FocusFieldHorizontal = ImageVector.Builder(
            name = "FocusFieldHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(5f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(5f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                moveTo(7f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(15f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _FocusFieldHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _FocusFieldHorizontal: ImageVector? = null
