package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sim: ImageVector
    get() {
        if (_Sim != null) {
            return _Sim!!
        }
        _Sim = ImageVector.Builder(
            name = "Sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                horizontalLineTo(10f)
                lineTo(4f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(4f)
                moveTo(9f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(17f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(9f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                moveTo(17f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Sim!!
    }

@Suppress("ObjectPropertyName")
private var _Sim: ImageVector? = null
