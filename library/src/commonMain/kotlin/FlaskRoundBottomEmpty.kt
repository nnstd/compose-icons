package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskRoundBottomEmpty: ImageVector
    get() {
        if (_FlaskRoundBottomEmpty != null) {
            return _FlaskRoundBottomEmpty!!
        }
        _FlaskRoundBottomEmpty = ImageVector.Builder(
            name = "FlaskRoundBottomEmpty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                curveTo(19f, 18.87f, 15.87f, 22f, 12f, 22f)
                curveTo(8.13f, 22f, 5f, 18.87f, 5f, 15f)
                curveTo(5f, 12.21f, 6.64f, 9.8f, 9f, 8.67f)
                verticalLineTo(5f)
                curveTo(9f, 4.45f, 9.45f, 4f, 10f, 4f)
                horizontalLineTo(10.5f)
                lineTo(9.5f, 2f)
                horizontalLineTo(14.5f)
                lineTo(13.5f, 4f)
                horizontalLineTo(14f)
                curveTo(14.55f, 4f, 15f, 4.45f, 15f, 5f)
                verticalLineTo(8.67f)
                curveTo(17.36f, 9.8f, 19f, 12.21f, 19f, 15f)
                close()
            }
        }.build()

        return _FlaskRoundBottomEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskRoundBottomEmpty: ImageVector? = null
