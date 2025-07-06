package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Induction: ImageVector
    get() {
        if (_Induction != null) {
            return _Induction!!
        }
        _Induction = ImageVector.Builder(
            name = "Induction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 2f)
                curveTo(20.75f, 2f, 18.75f, 2.61f, 17.19f, 3.33f)
                curveTo(15.79f, 2.61f, 14f, 2f, 12f, 2f)
                reflectiveCurveTo(8.21f, 2.61f, 6.81f, 3.33f)
                curveTo(5.25f, 2.61f, 3.25f, 2f, 1f, 2f)
                verticalLineTo(4f)
                curveTo(2.36f, 4f, 3.61f, 4.27f, 4.71f, 4.64f)
                curveTo(4.03f, 5.15f, 3.63f, 5.54f, 3.59f, 5.59f)
                curveTo(3.21f, 5.96f, 3f, 6.47f, 3f, 7f)
                verticalLineTo(18f)
                curveTo(3f, 20.21f, 4.79f, 22f, 7f, 22f)
                reflectiveCurveTo(11f, 20.21f, 11f, 18f)
                verticalLineTo(7f)
                curveTo(11f, 6.42f, 10.75f, 5.88f, 10.32f, 5.5f)
                curveTo(10.26f, 5.45f, 9.8f, 5.05f, 9f, 4.54f)
                curveTo(9.92f, 4.22f, 10.92f, 4f, 12f, 4f)
                reflectiveCurveTo(14.08f, 4.22f, 15f, 4.54f)
                curveTo(14.2f, 5.05f, 13.74f, 5.45f, 13.68f, 5.5f)
                curveTo(13.25f, 5.88f, 13f, 6.42f, 13f, 7f)
                verticalLineTo(18f)
                curveTo(13f, 20.21f, 14.79f, 22f, 17f, 22f)
                reflectiveCurveTo(21f, 20.21f, 21f, 18f)
                verticalLineTo(7f)
                curveTo(21f, 6.47f, 20.79f, 5.96f, 20.41f, 5.59f)
                curveTo(20.37f, 5.54f, 19.97f, 5.15f, 19.29f, 4.64f)
                curveTo(20.39f, 4.27f, 21.64f, 4f, 23f, 4f)
                verticalLineTo(2f)
                moveTo(9f, 7f)
                verticalLineTo(18f)
                curveTo(9f, 19.11f, 8.11f, 20f, 7f, 20f)
                reflectiveCurveTo(5f, 19.11f, 5f, 18f)
                verticalLineTo(7f)
                curveTo(5f, 7f, 5.7f, 6.31f, 6.87f, 5.58f)
                curveTo(8.2f, 6.31f, 9f, 7f, 9f, 7f)
                moveTo(19f, 7f)
                verticalLineTo(18f)
                curveTo(19f, 19.11f, 18.11f, 20f, 17f, 20f)
                reflectiveCurveTo(15f, 19.11f, 15f, 18f)
                verticalLineTo(7f)
                curveTo(15f, 7f, 15.8f, 6.31f, 17.13f, 5.58f)
                curveTo(18.3f, 6.31f, 19f, 7f, 19f, 7f)
                close()
            }
        }.build()

        return _Induction!!
    }

@Suppress("ObjectPropertyName")
private var _Induction: ImageVector? = null
