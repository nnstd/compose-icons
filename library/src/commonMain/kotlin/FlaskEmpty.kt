package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskEmpty: ImageVector
    get() {
        if (_FlaskEmpty != null) {
            return _FlaskEmpty!!
        }
        _FlaskEmpty = ImageVector.Builder(
            name = "FlaskEmpty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                curveTo(3f, 18.4f, 3.18f, 17.84f, 3.5f, 17.37f)
                lineTo(9f, 7.81f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6f)
                verticalLineTo(7.81f)
                lineTo(20.5f, 17.37f)
                curveTo(20.82f, 17.84f, 21f, 18.4f, 21f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _FlaskEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskEmpty: ImageVector? = null
