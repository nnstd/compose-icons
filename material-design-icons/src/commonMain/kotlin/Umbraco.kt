package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Umbraco: ImageVector
    get() {
        if (_Umbraco != null) {
            return _Umbraco!!
        }
        _Umbraco = ImageVector.Builder(
            name = "Umbraco",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.6f, 8.6f)
                lineTo(7.17f, 8.38f)
                curveTo(6.5f, 11.67f, 6.46f, 14.24f, 7.61f, 15.5f)
                curveTo(8.6f, 16.61f, 11.89f, 16.61f, 11.89f, 16.61f)
                curveTo(11.89f, 16.61f, 15.29f, 16.61f, 16.28f, 15.5f)
                curveTo(17.43f, 14.24f, 17.38f, 11.67f, 16.72f, 8.38f)
                lineTo(15.29f, 8.6f)
                curveTo(15.29f, 8.6f, 16.54f, 13.88f, 14.69f, 14.69f)
                curveTo(13.81f, 15.07f, 11.89f, 15.07f, 11.89f, 15.07f)
                curveTo(11.89f, 15.07f, 10.08f, 15.07f, 9.2f, 14.69f)
                curveTo(7.35f, 13.88f, 8.6f, 8.6f, 8.6f, 8.6f)
                moveTo(12f, 3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
            }
        }.build()

        return _Umbraco!!
    }

@Suppress("ObjectPropertyName")
private var _Umbraco: ImageVector? = null
