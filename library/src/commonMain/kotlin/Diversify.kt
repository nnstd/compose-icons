package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Diversify: ImageVector
    get() {
        if (_Diversify != null) {
            return _Diversify!!
        }
        _Diversify = ImageVector.Builder(
            name = "Diversify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                curveTo(10.9f, 4f, 10f, 4.89f, 10f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                lineTo(22f, 5f)
                lineTo(19f, 2f)
                moveTo(19f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                lineTo(22f, 12f)
                lineTo(19f, 9f)
                moveTo(11.05f, 10f)
                curveTo(9.94f, 10f, 9.04f, 10.87f, 9.03f, 12f)
                reflectiveCurveTo(9.9f, 14f, 11f, 14f)
                curveTo(12.11f, 14f, 13f, 13.11f, 13f, 12f)
                curveTo(13f, 10.91f, 12.13f, 10.03f, 11.05f, 10f)
                moveTo(2f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                moveTo(10f, 15f)
                verticalLineTo(18f)
                curveTo(10f, 19.11f, 10.9f, 20f, 12f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                lineTo(22f, 19f)
                lineTo(19f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Diversify!!
    }

@Suppress("ObjectPropertyName")
private var _Diversify: ImageVector? = null
