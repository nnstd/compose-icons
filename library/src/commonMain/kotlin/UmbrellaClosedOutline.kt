package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UmbrellaClosedOutline: ImageVector
    get() {
        if (_UmbrellaClosedOutline != null) {
            return _UmbrellaClosedOutline!!
        }
        _UmbrellaClosedOutline = ImageVector.Builder(
            name = "UmbrellaClosedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(12.4f, 2f, 12.8f, 2.2f, 12.9f, 2.6f)
                lineTo(17.5f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                curveTo(13f, 20.7f, 11.7f, 22f, 10f, 22f)
                reflectiveCurveTo(7f, 20.7f, 7f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                curveTo(9f, 19.6f, 9.4f, 20f, 10f, 20f)
                curveTo(10.6f, 20f, 11f, 19.6f, 11f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(6.5f)
                lineTo(11.1f, 2.6f)
                curveTo(11.2f, 2.2f, 11.6f, 2f, 12f, 2f)
                moveTo(12f, 5.9f)
                lineTo(9.4f, 13f)
                horizontalLineTo(14.7f)
                lineTo(12f, 5.9f)
                close()
            }
        }.build()

        return _UmbrellaClosedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaClosedOutline: ImageVector? = null
