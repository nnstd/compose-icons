package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CeilingLight: ImageVector
    get() {
        if (_CeilingLight != null) {
            return _CeilingLight!!
        }
        _CeilingLight = ImageVector.Builder(
            name = "CeilingLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                lineTo(20f, 17f)
                horizontalLineTo(4f)
                lineTo(8f, 9f)
                moveTo(14f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _CeilingLight!!
    }

@Suppress("ObjectPropertyName")
private var _CeilingLight: ImageVector? = null
