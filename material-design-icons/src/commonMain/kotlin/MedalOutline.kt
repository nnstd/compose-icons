package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MedalOutline: ImageVector
    get() {
        if (_MedalOutline != null) {
            return _MedalOutline!!
        }
        _MedalOutline = ImageVector.Builder(
            name = "MedalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.94f, 19.5f)
                lineTo(12f, 17.77f)
                lineTo(9.06f, 19.5f)
                lineTo(9.84f, 16.16f)
                lineTo(7.25f, 13.92f)
                lineTo(10.66f, 13.63f)
                lineTo(12f, 10.5f)
                lineTo(13.34f, 13.63f)
                lineTo(16.75f, 13.92f)
                lineTo(14.16f, 16.16f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                lineTo(8.86f, 7.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.14f, 7.64f)
                lineTo(20f, 4f)
                moveTo(18f, 15f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.82f, 9.12f)
                arcTo(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.18f, 9.12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                moveTo(12.63f, 7f)
                horizontalLineTo(11.37f)
                lineTo(7.37f, 4f)
                horizontalLineTo(16.71f)
                close()
            }
        }.build()

        return _MedalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MedalOutline: ImageVector? = null
