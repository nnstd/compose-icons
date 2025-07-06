package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FocusAuto: ImageVector
    get() {
        if (_FocusAuto != null) {
            return _FocusAuto!!
        }
        _FocusAuto = ImageVector.Builder(
            name = "FocusAuto",
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
                moveTo(8f, 7f)
                curveTo(6.9f, 7f, 6f, 7.9f, 6f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                curveTo(12f, 7.9f, 11.1f, 7f, 10f, 7f)
                horizontalLineTo(8f)
                moveTo(8f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(13f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FocusAuto!!
    }

@Suppress("ObjectPropertyName")
private var _FocusAuto: ImageVector? = null
