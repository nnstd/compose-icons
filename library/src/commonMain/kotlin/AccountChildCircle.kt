package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountChildCircle: ImageVector
    get() {
        if (_AccountChildCircle != null) {
            return _AccountChildCircle!!
        }
        _AccountChildCircle = ImageVector.Builder(
            name = "AccountChildCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 16f)
                curveTo(12.72f, 16f, 13.4f, 16.15f, 14.04f, 16.5f)
                curveTo(14.68f, 16.8f, 15f, 17.2f, 15f, 17.67f)
                verticalLineTo(19.41f)
                curveTo(16.34f, 18.81f, 17f, 18.08f, 17f, 17.2f)
                verticalLineTo(12.8f)
                curveTo(17f, 12f, 16.5f, 11.35f, 15.45f, 10.8f)
                curveTo(14.4f, 10.26f, 13.25f, 10f, 12f, 10f)
                curveTo(10.75f, 10f, 9.6f, 10.26f, 8.55f, 10.8f)
                curveTo(7.5f, 11.35f, 7f, 12f, 7f, 12.8f)
                verticalLineTo(17.2f)
                curveTo(7f, 18f, 7.53f, 18.69f, 8.63f, 19.22f)
                curveTo(9.72f, 19.75f, 10.84f, 20f, 12f, 20f)
                lineTo(13f, 19.92f)
                verticalLineTo(17.91f)
                lineTo(12f, 18f)
                curveTo(11f, 18f, 10f, 17.8f, 9.05f, 17.39f)
                curveTo(9.17f, 17f, 9.53f, 16.69f, 10.13f, 16.41f)
                curveTo(10.72f, 16.13f, 11.34f, 16f, 12f, 16f)
                moveTo(12f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _AccountChildCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AccountChildCircle: ImageVector? = null
