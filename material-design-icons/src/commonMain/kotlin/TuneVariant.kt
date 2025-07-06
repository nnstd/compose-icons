package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TuneVariant: ImageVector
    get() {
        if (_TuneVariant != null) {
            return _TuneVariant!!
        }
        _TuneVariant = ImageVector.Builder(
            name = "TuneVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 13f)
                curveTo(6.14f, 13f, 4.59f, 14.28f, 4.14f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(4.14f)
                curveTo(4.59f, 19.72f, 6.14f, 21f, 8f, 21f)
                reflectiveCurveTo(11.41f, 19.72f, 11.86f, 18f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(11.86f)
                curveTo(11.41f, 14.28f, 9.86f, 13f, 8f, 13f)
                moveTo(8f, 19f)
                curveTo(6.9f, 19f, 6f, 18.1f, 6f, 17f)
                curveTo(6f, 15.9f, 6.9f, 15f, 8f, 15f)
                reflectiveCurveTo(10f, 15.9f, 10f, 17f)
                curveTo(10f, 18.1f, 9.1f, 19f, 8f, 19f)
                moveTo(19.86f, 6f)
                curveTo(19.41f, 4.28f, 17.86f, 3f, 16f, 3f)
                reflectiveCurveTo(12.59f, 4.28f, 12.14f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(12.14f)
                curveTo(12.59f, 9.72f, 14.14f, 11f, 16f, 11f)
                reflectiveCurveTo(19.41f, 9.72f, 19.86f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(19.86f)
                moveTo(16f, 9f)
                curveTo(14.9f, 9f, 14f, 8.1f, 14f, 7f)
                curveTo(14f, 5.9f, 14.9f, 5f, 16f, 5f)
                reflectiveCurveTo(18f, 5.9f, 18f, 7f)
                curveTo(18f, 8.1f, 17.1f, 9f, 16f, 9f)
                close()
            }
        }.build()

        return _TuneVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TuneVariant: ImageVector? = null
