package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UmbrellaClosedVariant: ImageVector
    get() {
        if (_UmbrellaClosedVariant != null) {
            return _UmbrellaClosedVariant!!
        }
        _UmbrellaClosedVariant = ImageVector.Builder(
            name = "UmbrellaClosedVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                lineTo(13f, 6f)
                verticalLineTo(3.5f)
                curveTo(13f, 3.2f, 13.2f, 3f, 13.5f, 3f)
                reflectiveCurveTo(14f, 3.2f, 14f, 3.5f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(3.5f)
                curveTo(16f, 2.1f, 14.9f, 1f, 13.5f, 1f)
                reflectiveCurveTo(11f, 2.1f, 11f, 3.5f)
                verticalLineTo(6f)
                lineTo(9f, 7f)
                lineTo(6f, 6f)
                lineTo(11.1f, 21.3f)
                curveTo(11.4f, 22.2f, 12.7f, 22.2f, 13f, 21.3f)
                curveTo(14.6f, 16.2f, 18f, 6f, 18f, 6f)
                lineTo(15f, 7f)
                moveTo(11f, 15f)
                lineTo(9f, 8.9f)
                lineTo(9.7f, 9.1f)
                lineTo(11f, 8.1f)
                verticalLineTo(15f)
                moveTo(13f, 8.1f)
                lineTo(14.3f, 9.1f)
                lineTo(15f, 8.9f)
                lineTo(13f, 15f)
                verticalLineTo(8.1f)
                close()
            }
        }.build()

        return _UmbrellaClosedVariant!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaClosedVariant: ImageVector? = null
