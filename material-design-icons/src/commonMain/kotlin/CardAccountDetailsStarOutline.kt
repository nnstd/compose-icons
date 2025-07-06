package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountDetailsStarOutline: ImageVector
    get() {
        if (_CardAccountDetailsStarOutline != null) {
            return _CardAccountDetailsStarOutline!!
        }
        _CardAccountDetailsStarOutline = ImageVector.Builder(
            name = "CardAccountDetailsStarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22.09f)
                lineTo(22.45f, 23.58f)
                lineTo(21.8f, 20.77f)
                lineTo(24f, 18.89f)
                lineTo(21.11f, 18.64f)
                lineTo(20f, 16f)
                lineTo(18.87f, 18.64f)
                lineTo(16f, 18.89f)
                lineTo(18.18f, 20.77f)
                lineTo(17.5f, 23.58f)
                lineTo(20f, 22.09f)
                moveTo(14.08f, 21f)
                horizontalLineTo(2f)
                curveTo(0.91f, 20.96f, 0.04f, 20.09f, 0f, 19f)
                verticalLineTo(5f)
                curveTo(0.04f, 3.91f, 0.91f, 3.04f, 2f, 3f)
                horizontalLineTo(22f)
                curveTo(23.09f, 3.04f, 23.96f, 3.91f, 24f, 5f)
                verticalLineTo(15.53f)
                curveTo(23.42f, 15f, 22.75f, 14.61f, 22f, 14.34f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(14.08f)
                curveTo(14.03f, 19.33f, 14f, 19.66f, 14f, 20f)
                curveTo(14f, 20.34f, 14.03f, 20.68f, 14.08f, 21f)
                moveTo(14f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(15.75f)
                curveTo(4f, 14.09f, 7.34f, 13.25f, 9f, 13.25f)
                curveTo(10.66f, 13.25f, 14f, 14.09f, 14f, 15.75f)
                verticalLineTo(17f)
                moveTo(14f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(9f, 7f)
                curveTo(7.63f, 7f, 6.5f, 8.13f, 6.5f, 9.5f)
                curveTo(6.5f, 10.87f, 7.63f, 12f, 9f, 12f)
                curveTo(10.37f, 12f, 11.5f, 10.87f, 11.5f, 9.5f)
                curveTo(11.5f, 8.13f, 10.37f, 7f, 9f, 7f)
                moveTo(14f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                moveTo(14f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _CardAccountDetailsStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountDetailsStarOutline: ImageVector? = null
