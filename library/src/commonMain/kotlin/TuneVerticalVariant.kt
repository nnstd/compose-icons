package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TuneVerticalVariant: ImageVector
    get() {
        if (_TuneVerticalVariant != null) {
            return _TuneVerticalVariant!!
        }
        _TuneVerticalVariant = ImageVector.Builder(
            name = "TuneVerticalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12.14f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineTo(12.14f)
                curveTo(4.28f, 12.59f, 3f, 14.14f, 3f, 16f)
                reflectiveCurveTo(4.28f, 19.41f, 6f, 19.86f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(19.86f)
                curveTo(9.72f, 19.41f, 11f, 17.86f, 11f, 16f)
                reflectiveCurveTo(9.72f, 12.59f, 8f, 12.14f)
                moveTo(7f, 14f)
                curveTo(8.1f, 14f, 9f, 14.9f, 9f, 16f)
                reflectiveCurveTo(8.1f, 18f, 7f, 18f)
                curveTo(5.9f, 18f, 5f, 17.1f, 5f, 16f)
                reflectiveCurveTo(5.9f, 14f, 7f, 14f)
                moveTo(18f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(4.14f)
                curveTo(14.28f, 4.59f, 13f, 6.14f, 13f, 8f)
                reflectiveCurveTo(14.28f, 11.41f, 16f, 11.86f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(11.86f)
                curveTo(19.72f, 11.41f, 21f, 9.86f, 21f, 8f)
                reflectiveCurveTo(19.72f, 4.59f, 18f, 4.14f)
                verticalLineTo(2f)
                moveTo(17f, 6f)
                curveTo(18.1f, 6f, 19f, 6.9f, 19f, 8f)
                reflectiveCurveTo(18.1f, 10f, 17f, 10f)
                curveTo(15.9f, 10f, 15f, 9.1f, 15f, 8f)
                reflectiveCurveTo(15.9f, 6f, 17f, 6f)
                close()
            }
        }.build()

        return _TuneVerticalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TuneVerticalVariant: ImageVector? = null
