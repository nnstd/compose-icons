package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommaCircle: ImageVector
    get() {
        if (_CommaCircle != null) {
            return _CommaCircle!!
        }
        _CommaCircle = ImageVector.Builder(
            name = "CommaCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(15f, 13f)
                lineTo(13f, 17f)
                horizontalLineTo(10f)
                lineTo(12f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CommaCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CommaCircle: ImageVector? = null
