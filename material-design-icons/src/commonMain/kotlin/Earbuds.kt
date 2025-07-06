package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Earbuds: ImageVector
    get() {
        if (_Earbuds != null) {
            return _Earbuds!!
        }
        _Earbuds = ImageVector.Builder(
            name = "Earbuds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                verticalLineTo(20f)
                curveTo(10f, 20.55f, 9.55f, 21f, 9f, 21f)
                horizontalLineTo(8f)
                curveTo(7.45f, 21f, 7f, 20.55f, 7f, 20f)
                verticalLineTo(13.27f)
                curveTo(6.32f, 13.72f, 5.61f, 14f, 5f, 14f)
                curveTo(3f, 14f, 2f, 12f, 2f, 11f)
                verticalLineTo(6f)
                curveTo(2f, 5f, 3f, 3f, 5f, 3f)
                reflectiveCurveTo(10f, 6f, 10f, 8f)
                moveTo(16.5f, 3f)
                curveTo(13.46f, 3f, 11f, 5.46f, 11f, 8.5f)
                reflectiveCurveTo(13.46f, 14f, 16.5f, 14f)
                reflectiveCurveTo(22f, 11.54f, 22f, 8.5f)
                reflectiveCurveTo(19.54f, 3f, 16.5f, 3f)
                moveTo(14.5f, 14.68f)
                verticalLineTo(20f)
                curveTo(14.5f, 20.55f, 14.95f, 21f, 15.5f, 21f)
                horizontalLineTo(17.5f)
                curveTo(18.05f, 21f, 18.5f, 20.55f, 18.5f, 20f)
                verticalLineTo(14.68f)
                curveTo(17.87f, 14.89f, 17.2f, 15f, 16.5f, 15f)
                reflectiveCurveTo(15.13f, 14.89f, 14.5f, 14.68f)
                close()
            }
        }.build()

        return _Earbuds!!
    }

@Suppress("ObjectPropertyName")
private var _Earbuds: ImageVector? = null
