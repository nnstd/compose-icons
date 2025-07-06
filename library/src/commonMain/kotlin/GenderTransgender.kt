package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GenderTransgender: ImageVector
    get() {
        if (_GenderTransgender != null) {
            return _GenderTransgender!!
        }
        _GenderTransgender = ImageVector.Builder(
            name = "GenderTransgender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.58f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(4.41f)
                lineTo(16.17f, 9.24f)
                curveTo(16.69f, 10.03f, 17f, 11f, 17f, 12f)
                curveTo(17f, 14.42f, 15.28f, 16.44f, 13f, 16.9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(16.9f)
                curveTo(8.72f, 16.44f, 7f, 14.42f, 7f, 12f)
                curveTo(7f, 11f, 7.3f, 10.04f, 7.82f, 9.26f)
                lineTo(6.64f, 8.07f)
                lineTo(5.24f, 9.46f)
                lineTo(3.83f, 8.04f)
                lineTo(5.23f, 6.65f)
                lineTo(3f, 4.42f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(4.41f)
                lineTo(6.64f, 5.24f)
                lineTo(8.08f, 3.81f)
                lineTo(9.5f, 5.23f)
                lineTo(8.06f, 6.66f)
                lineTo(9.23f, 7.84f)
                curveTo(10f, 7.31f, 11f, 7f, 12f, 7f)
                curveTo(13f, 7f, 13.96f, 7.3f, 14.75f, 7.83f)
                lineTo(19.58f, 3f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _GenderTransgender!!
    }

@Suppress("ObjectPropertyName")
private var _GenderTransgender: ImageVector? = null
