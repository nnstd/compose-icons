package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSchoolOutline: ImageVector
    get() {
        if (_AccountSchoolOutline != null) {
            return _AccountSchoolOutline!!
        }
        _AccountSchoolOutline = ImageVector.Builder(
            name = "AccountSchoolOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10.5f)
                verticalLineTo(6f)
                lineTo(15.89f, 7.06f)
                curveTo(15.96f, 7.36f, 16f, 7.67f, 16f, 8f)
                curveTo(16f, 10.21f, 14.21f, 12f, 12f, 12f)
                curveTo(9.79f, 12f, 8f, 10.21f, 8f, 8f)
                curveTo(8f, 7.67f, 8.04f, 7.36f, 8.11f, 7.06f)
                lineTo(5f, 5.5f)
                lineTo(12f, 2f)
                lineTo(19f, 5.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(18f)
                moveTo(12f, 9f)
                lineTo(10f, 8f)
                curveTo(10f, 9.1f, 10.9f, 10f, 12f, 10f)
                curveTo(13.1f, 10f, 14f, 9.1f, 14f, 8f)
                lineTo(12f, 9f)
                moveTo(14.75f, 5.42f)
                lineTo(12.16f, 4.1f)
                lineTo(9.47f, 5.47f)
                lineTo(12.07f, 6.79f)
                lineTo(14.75f, 5.42f)
                moveTo(12f, 13f)
                curveTo(14.67f, 13f, 20f, 14.33f, 20f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(4f, 14.33f, 9.33f, 13f, 12f, 13f)
                moveTo(12f, 14.9f)
                curveTo(9f, 14.9f, 5.9f, 16.36f, 5.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(17f)
                curveTo(18.1f, 16.36f, 14.97f, 14.9f, 12f, 14.9f)
                close()
            }
        }.build()

        return _AccountSchoolOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSchoolOutline: ImageVector? = null
