package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertCircle: ImageVector
    get() {
        if (_AlertCircle != null) {
            return _AlertCircle!!
        }
        _AlertCircle = ImageVector.Builder(
            name = "AlertCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _AlertCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlertCircle: ImageVector? = null
